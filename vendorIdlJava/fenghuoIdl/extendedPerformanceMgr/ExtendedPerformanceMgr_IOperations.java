package extendedPerformanceMgr;

/**
 *	Generated from IDL interface "ExtendedPerformanceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ExtendedPerformanceMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void removePMPs(globaldefs.NameAndStringValue_T[][] pmpNameList, globaldefs.NamingAttributesList_THolder failedPmpNameList) throws globaldefs.ProcessingFailureException;
	void createPMP(performance.PMP_T pmpData) throws globaldefs.ProcessingFailureException;
	void modifyPMP(performance.PMP_T pmpData) throws globaldefs.ProcessingFailureException;
	void getAllExtraPmp(globaldefs.NameAndStringValue_T[] meName, int how_many, performance.PMPList_THolder pmpList, performance.PMPIterator_IHolder pmpIt) throws globaldefs.ProcessingFailureException;
	void clearPMData(extendedPerformanceMgr.PMTPPmNameSelect_T[] pmTPSelectList, extendedPerformanceMgr.PMTPPmNameList_THolder failedTPSelectList) throws globaldefs.ProcessingFailureException;
}
