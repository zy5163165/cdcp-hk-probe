package extendedEmsMgr;

/**
 *	Generated from IDL interface "AlarmReportingMaskIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class AlarmReportingMaskIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public AlarmReportingMaskIterator_I value;
	public AlarmReportingMaskIterator_IHolder()
	{
	}
	public AlarmReportingMaskIterator_IHolder (final AlarmReportingMaskIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AlarmReportingMaskIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmReportingMaskIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AlarmReportingMaskIterator_IHelper.write (_out,value);
	}
}
