package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "EquipmentClock_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentClock_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EquipmentClock_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String clockStatus = "";
	public java.lang.String synchroSrcClass = "";
	public java.lang.String synchroSrc = "";
	public java.lang.String workMode = "";
	public java.lang.String[] clockSourceList;
	public java.lang.String synchroProtocol = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EquipmentClock_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String clockStatus, java.lang.String synchroSrcClass, java.lang.String synchroSrc, java.lang.String workMode, java.lang.String[] clockSourceList, java.lang.String synchroProtocol, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.clockStatus = clockStatus;
		this.synchroSrcClass = synchroSrcClass;
		this.synchroSrc = synchroSrc;
		this.workMode = workMode;
		this.clockSourceList = clockSourceList;
		this.synchroProtocol = synchroProtocol;
		this.additionalInfo = additionalInfo;
	}
}
