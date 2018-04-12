package extendedMLSNMgr;

/**
 *	Generated from IDL interface "ExtendedMLSNMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ExtendedMLSNMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getMLSNBackBoneRoute(globaldefs.NameAndStringValue_T[] subnetName, int how_many, boolean getMainRoute, topologicalLink.TopologicalLinkList_THolder routeList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException;
	void setMLSNPPLinkSRLGs(java.lang.String sRLGName, globaldefs.NameAndStringValue_T[][] mLSNPPLinkNames) throws globaldefs.ProcessingFailureException;
	void getTNetworkProtectionGroups(globaldefs.NameAndStringValue_T[] subnetName, java.lang.String protectionType, int how_many, extendedMLSNMgr.TNProtectionGroupList_THolder tnProtectionGroupList, extendedMLSNMgr.TNProtectionGroupIterator_IHolder tnpIt) throws globaldefs.ProcessingFailureException;
	void createTNetworkProtectionGroup(extendedMLSNMgr.TNetworkProtectionGroup_T tNProtectionGroupToCreate, extendedMLSNMgr.TNetworkProtectionGroup_THolder createdTNProtectionGroup) throws globaldefs.ProcessingFailureException;
	void deleteTNetworkProtectionGroups(globaldefs.NameAndStringValue_T[] tnProtectionGroupName) throws globaldefs.ProcessingFailureException;
	void modifyTNetworkProtectionGroups(java.lang.String modifyType, extendedMLSNMgr.TNetworkProtectionGroup_T tnProtectionGroupToModify, extendedMLSNMgr.TNetworkProtectionGroup_THolder tnProtectionGroupModified) throws globaldefs.ProcessingFailureException;
	void performTnpProtectionCommand(protection.ProtectionCommand_T protectionCommand, extendedMLSNMgr.TNetworkProtectionGroup_T oneTnpData, globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, globaldefs.NameAndStringValue_T[] fromTp, globaldefs.NameAndStringValue_T[] toTp, protection.SwitchData_THolder switchData) throws globaldefs.ProcessingFailureException;
}
