package extendedFlowDomainMgr;

/**
 *	Generated from IDL interface "ExMFDFrIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ExMFDFrIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExMFDFrIterator_I value;
	public ExMFDFrIterator_IHolder()
	{
	}
	public ExMFDFrIterator_IHolder (final ExMFDFrIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ExMFDFrIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExMFDFrIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExMFDFrIterator_IHelper.write (_out,value);
	}
}
