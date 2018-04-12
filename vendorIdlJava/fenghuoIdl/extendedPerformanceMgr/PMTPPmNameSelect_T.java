package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of struct "PMTPPmNameSelect_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPPmNameSelect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMTPPmNameSelect_T(){}
	public performance.PMTPSelect_T pmTpSelect;
	public java.lang.String[] pmParamList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public PMTPPmNameSelect_T(performance.PMTPSelect_T pmTpSelect, java.lang.String[] pmParamList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.pmTpSelect = pmTpSelect;
		this.pmParamList = pmParamList;
		this.additionalInfo = additionalInfo;
	}
}
