package extendedFlowDomainMgr;


/**
 *	Generated from IDL definition of struct "exMegEntityData_T"
 *	@author JacORB IDL compiler 
 */

public final class exMegEntityData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(extendedFlowDomainMgr.exMegEntityData_THelper.id(),"exMegEntityData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("megName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("megLayerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("assignedEntityName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedFlowDomainMgr.exMegEntityData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedFlowDomainMgr.exMegEntityData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedFlowDomainMgr/exMegEntityData_T:1.0";
	}
	public static extendedFlowDomainMgr.exMegEntityData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedFlowDomainMgr.exMegEntityData_T result = new extendedFlowDomainMgr.exMegEntityData_T();
		result.megName = globaldefs.NVSList_THelper.read(in);
		result.megLayerRate=in.read_short();
		result.assignedEntityName = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedFlowDomainMgr.exMegEntityData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.megName);
		out.write_short(s.megLayerRate);
		globaldefs.NVSList_THelper.write(out,s.assignedEntityName);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
