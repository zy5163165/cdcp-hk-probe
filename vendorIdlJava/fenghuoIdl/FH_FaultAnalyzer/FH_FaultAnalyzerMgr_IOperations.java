package FH_FaultAnalyzer;

/**
 *	Generated from IDL interface "FH_FaultAnalyzerMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface FH_FaultAnalyzerMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void analyseAlarms(boolean bMasked, java.lang.String beginTime, java.lang.String endTime, int how_many, FH_FaultAnalyzer.FaultGroupList_THolder faultGroupList, FH_FaultAnalyzer.FaultGroupIterator_IHolder fgIt) throws globaldefs.ProcessingFailureException;
}
