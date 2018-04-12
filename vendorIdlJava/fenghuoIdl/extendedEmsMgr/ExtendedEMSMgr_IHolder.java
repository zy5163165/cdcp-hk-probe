package extendedEmsMgr;

/**
 *	Generated from IDL interface "ExtendedEMSMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ExtendedEMSMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExtendedEMSMgr_I value;
	public ExtendedEMSMgr_IHolder()
	{
	}
	public ExtendedEMSMgr_IHolder (final ExtendedEMSMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ExtendedEMSMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtendedEMSMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExtendedEMSMgr_IHelper.write (_out,value);
	}
}
