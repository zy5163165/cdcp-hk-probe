package extendedMaintenanceMgrOps;

/**
 *	Generated from IDL interface "extendedMaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface extendedMaintenanceMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void performMaintenanceOperation(maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOperationList) throws globaldefs.ProcessingFailureException;
}
