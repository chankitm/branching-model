package ims.vi.common.bean;
/**
 * Since JAXB cannot handle interface, used
 * abstract class instead
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
public abstract class Package {
	public abstract String getNameChi();
	public abstract String getNameEng();
	public abstract String getCode();
	public abstract String getServiceType();
}
