package extendedManagedElementManager;

/**
 *	Generated from IDL interface "ClockLinkNetIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ClockLinkNetIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ClockLinkNetIterator_I value;
	public ClockLinkNetIterator_IHolder()
	{
	}
	public ClockLinkNetIterator_IHolder (final ClockLinkNetIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ClockLinkNetIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClockLinkNetIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ClockLinkNetIterator_IHelper.write (_out,value);
	}
}
