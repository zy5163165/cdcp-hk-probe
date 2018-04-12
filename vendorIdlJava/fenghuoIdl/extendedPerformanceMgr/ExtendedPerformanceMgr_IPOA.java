package extendedPerformanceMgr;

/**
 *	Generated from IDL interface "ExtendedPerformanceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class ExtendedPerformanceMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, extendedPerformanceMgr.ExtendedPerformanceMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "createPMP", new java.lang.Integer(0));
		m_opsHash.put ( "clearPMData", new java.lang.Integer(1));
		m_opsHash.put ( "modifyPMP", new java.lang.Integer(2));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(3));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(4));
		m_opsHash.put ( "removePMPs", new java.lang.Integer(5));
		m_opsHash.put ( "getAllExtraPmp", new java.lang.Integer(6));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(7));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(8));
		m_opsHash.put ( "setOwner", new java.lang.Integer(9));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org.fiberhome.extended/extendedPerformanceMgr/ExtendedPerformanceMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public extendedPerformanceMgr.ExtendedPerformanceMgr_I _this()
	{
		return extendedPerformanceMgr.ExtendedPerformanceMgr_IHelper.narrow(_this_object());
	}
	public extendedPerformanceMgr.ExtendedPerformanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedPerformanceMgr.ExtendedPerformanceMgr_IHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // createPMP
			{
			try
			{
				performance.PMP_T _arg0=performance.PMP_THelper.read(_input);
				_out = handler.createReply();
				createPMP(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // clearPMData
			{
			try
			{
				extendedPerformanceMgr.PMTPPmNameSelect_T[] _arg0=extendedPerformanceMgr.PMTPPmNameList_THelper.read(_input);
				extendedPerformanceMgr.PMTPPmNameList_THolder _arg1= new extendedPerformanceMgr.PMTPPmNameList_THolder();
				_out = handler.createReply();
				clearPMData(_arg0,_arg1);
				extendedPerformanceMgr.PMTPPmNameList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // modifyPMP
			{
			try
			{
				performance.PMP_T _arg0=performance.PMP_THelper.read(_input);
				_out = handler.createReply();
				modifyPMP(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setAdditionalInfo
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NVSList_THolder _arg1= new globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getCapabilities
			{
			try
			{
				common.CapabilityList_THolder _arg0= new common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // removePMPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				removePMPs(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllExtraPmp
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				performance.PMPList_THolder _arg2= new performance.PMPList_THolder();
				performance.PMPIterator_IHolder _arg3= new performance.PMPIterator_IHolder();
				_out = handler.createReply();
				getAllExtraPmp(_arg0,_arg1,_arg2,_arg3);
				performance.PMPList_THelper.write(_out,_arg2.value);
				performance.PMPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // setUserLabel
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setNativeEMSName
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setOwner
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}