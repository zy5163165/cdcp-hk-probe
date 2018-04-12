package extendedFlowDomainMgr;

/**
 *	Generated from IDL interface "ExMegEntityIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ExMegEntityIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExMegEntityIterator_I value;
	public ExMegEntityIterator_IHolder()
	{
	}
	public ExMegEntityIterator_IHolder (final ExMegEntityIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ExMegEntityIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExMegEntityIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExMegEntityIterator_IHelper.write (_out,value);
	}
}
