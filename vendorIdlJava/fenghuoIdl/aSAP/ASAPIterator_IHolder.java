package aSAP;

/**
 *	Generated from IDL interface "ASAPIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ASAPIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ASAPIterator_I value;
	public ASAPIterator_IHolder()
	{
	}
	public ASAPIterator_IHolder (final ASAPIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ASAPIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ASAPIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ASAPIterator_IHelper.write (_out,value);
	}
}
