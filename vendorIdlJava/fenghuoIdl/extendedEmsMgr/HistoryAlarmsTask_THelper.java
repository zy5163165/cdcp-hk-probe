package extendedEmsMgr;


/**
 *	Generated from IDL definition of struct "HistoryAlarmsTask_T"
 *	@author JacORB IDL compiler 
 */

public final class HistoryAlarmsTask_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(extendedEmsMgr.HistoryAlarmsTask_THelper.id(),"HistoryAlarmsTask_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("objectName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("objectTypeList", extendedEmsMgr.ObjectTypeList_THelper.type(), null),new org.omg.CORBA.StructMember("excludeProbCauseList", notifications.ProbableCauseList_THelper.type(), null),new org.omg.CORBA.StructMember("excludeSeverityList", notifications.PerceivedSeverityList_THelper.type(), null),new org.omg.CORBA.StructMember("beginTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("endTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedEmsMgr.HistoryAlarmsTask_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedEmsMgr.HistoryAlarmsTask_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/HistoryAlarmsTask_T:1.0";
	}
	public static extendedEmsMgr.HistoryAlarmsTask_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedEmsMgr.HistoryAlarmsTask_T result = new extendedEmsMgr.HistoryAlarmsTask_T();
		result.objectName = globaldefs.NVSList_THelper.read(in);
		result.objectTypeList = extendedEmsMgr.ObjectTypeList_THelper.read(in);
		result.excludeProbCauseList = notifications.ProbableCauseList_THelper.read(in);
		result.excludeSeverityList = notifications.PerceivedSeverityList_THelper.read(in);
		result.beginTime=in.read_string();
		result.endTime=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedEmsMgr.HistoryAlarmsTask_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.objectName);
		extendedEmsMgr.ObjectTypeList_THelper.write(out,s.objectTypeList);
		notifications.ProbableCauseList_THelper.write(out,s.excludeProbCauseList);
		notifications.PerceivedSeverityList_THelper.write(out,s.excludeSeverityList);
		out.write_string(s.beginTime);
		out.write_string(s.endTime);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
