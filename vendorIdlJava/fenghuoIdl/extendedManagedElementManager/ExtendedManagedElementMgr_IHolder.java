package extendedManagedElementManager;

/**
 *	Generated from IDL interface "ExtendedManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ExtendedManagedElementMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExtendedManagedElementMgr_I value;
	public ExtendedManagedElementMgr_IHolder()
	{
	}
	public ExtendedManagedElementMgr_IHolder (final ExtendedManagedElementMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ExtendedManagedElementMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtendedManagedElementMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExtendedManagedElementMgr_IHelper.write (_out,value);
	}
}
