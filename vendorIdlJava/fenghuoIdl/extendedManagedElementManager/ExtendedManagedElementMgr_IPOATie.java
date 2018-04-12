package extendedManagedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ExtendedManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class ExtendedManagedElementMgr_IPOATie
	extends ExtendedManagedElementMgr_IPOA
{
	private ExtendedManagedElementMgr_IOperations _delegate;

	private POA _poa;
	public ExtendedManagedElementMgr_IPOATie(ExtendedManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ExtendedManagedElementMgr_IPOATie(ExtendedManagedElementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedManagedElementManager.ExtendedManagedElementMgr_I _this()
	{
		return extendedManagedElementManager.ExtendedManagedElementMgr_IHelper.narrow(_this_object());
	}
	public extendedManagedElementManager.ExtendedManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedManagedElementManager.ExtendedManagedElementMgr_IHelper.narrow(_this_object(orb));
	}
	public ExtendedManagedElementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ExtendedManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void createCrossConnection(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.TPData_T[] tpInclusions, subnetworkConnection.TPData_T[] tpExclusions, subnetworkConnection.CrossConnectList_THolder successCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.createCrossConnection(meName,ccList,tpInclusions,tpExclusions,successCCList);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void provisionEquipment(equipment.EQTCreateData_T[] equipmentCreateDataList, equipment.EquipmentOrHolderList_THolder successEquipmentList) throws globaldefs.ProcessingFailureException
	{
_delegate.provisionEquipment(equipmentCreateDataList,successEquipmentList);
	}

	public void deleteCrossConnection(globaldefs.NameAndStringValue_T[] meName, subnetworkConnection.CrossConnect_T[] ccList, subnetworkConnection.CrossConnectList_THolder failedCCList) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteCrossConnection(meName,ccList,failedCCList);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllClockLinkNets(globaldefs.NameAndStringValue_T[] targetObjName, java.lang.String linkType, int how_many, extendedManagedElementManager.ClockLinkNetList_THolder clockLinkNetList, extendedManagedElementManager.ClockLinkNetIterator_IHolder clockLinkNetIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllClockLinkNets(targetObjName,linkType,how_many,clockLinkNetList,clockLinkNetIt);
	}

	public void getAllCrossConnections(globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, subnetworkConnection.CrossConnectList_THolder ccList, subnetworkConnection.CCIterator_IHolder ccIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void deactivateCrossConnection(subnetworkConnection.CrossConnect_T crossConnection) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateCrossConnection(crossConnection);
	}

	public void activateCrossConnection(subnetworkConnection.CrossConnect_T crossConnection) throws globaldefs.ProcessingFailureException
	{
_delegate.activateCrossConnection(crossConnection);
	}

	public void getAllEquipmentClocks(globaldefs.NameAndStringValue_T[] targetObjName, int how_many, extendedManagedElementManager.EquipmentClockList_THolder ecList, extendedManagedElementManager.EquipmentClockIterator_IHolder ecIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentClocks(targetObjName,how_many,ecList,ecIt);
	}

	public void getAllMeClocks(globaldefs.NameAndStringValue_T[] targetObjName, int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMeClocks(targetObjName,how_many,meList,meIt);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
