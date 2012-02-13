package ims.vi.common.utils;

import ims.vi.common.annotation.ValueEqual;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.time.DateUtils;

import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;

public class ObjectUtils {
	private ObjectUtils(){
		
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T safeCast(Class<T> toClass,Object src){
		try{
			return (T)src;
		}catch(ClassCastException e){
			return null;
		}
	}
	
	/**
	 * Extract an object from the src[] using the index, and
	 * set the object as the target's property
	 * @param <T>
	 * @param target
	 * @param propertyName
	 * @param src
	 * @param index
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @author Ben CP Chan ben.cp.chan@pccw.com
	 */
	public static <T> void setProperty(T target, 
			String propertyName, Object[] src,
			int index) throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {
		if (index >= src.length || target == null) {
			return;
		}
		PropertyUtils.setProperty(target, propertyName, src[index]);
	}
	
	public static boolean isEqual(Object l, Object r){
		try{
			EqualsBuilder equalsBuilder = new EqualsBuilder();
			if (r == null) return false;
			r.getClass().asSubclass(l.getClass());
			if (l == r) return true;

			for (Field field: l.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				Field rField = r.getClass().getDeclaredField(field.getName());
				rField.setAccessible(true);
				if (field.getAnnotation(ValueEqual.class) == null) continue; 
				if (field.getType() == Date.class) {
					Date d1 = DateUtils.truncate((Date)field.get(l), Calendar.DATE);
					Date d2 = DateUtils.truncate((Date)rField.get(r), Calendar.DATE);
					if (d1.equals(d2)) continue;
					return false;
				}
				/*if (field.getType() == List.class) { 
					if (field.get(l) == null && rField.get(r) == null) continue;
					if (field.get(l) != null && rField.get(r)!= null && CollectionUtils.isEqualCollection((Collection)field.get(l), (Collection)rField.get(r)))
						continue;
					return false;
				}*/
				equalsBuilder.append(field.get(l), rField.get(r));
			}
			
			return equalsBuilder.isEquals();

		} catch (ClassCastException n) {
			return false;
		} catch (SecurityException e) {
			return false;
		} catch (IllegalArgumentException e) {
			return false;
		} catch (IllegalAccessException e) {
			return false;
		} catch (NoSuchFieldException e) {
			return false;
		}
	}
	
	public static int hashCode(Object obj) {
		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(17, 37);
		for (Field field: obj.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			try {
				if (field.getAnnotation(ValueEqual.class) == null) continue;
				if (field.getType() == Date.class) {
					hashCodeBuilder.append(DateUtils.truncate((Date)field.get(obj), Calendar.DATE));
					continue;
				}
				hashCodeBuilder.append(field.get(obj));
			} catch (IllegalArgumentException e) {
				return 0;
			} catch (IllegalAccessException e) {
				return 0;
			}
		}
		return hashCodeBuilder.toHashCode();
		
	}
}
