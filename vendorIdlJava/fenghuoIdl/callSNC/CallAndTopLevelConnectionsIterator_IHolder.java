package callSNC;

/**
 *	Generated from IDL interface "CallAndTopLevelConnectionsIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class CallAndTopLevelConnectionsIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public CallAndTopLevelConnectionsIterator_I value;
	public CallAndTopLevelConnectionsIterator_IHolder()
	{
	}
	public CallAndTopLevelConnectionsIterator_IHolder (final CallAndTopLevelConnectionsIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CallAndTopLevelConnectionsIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallAndTopLevelConnectionsIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CallAndTopLevelConnectionsIterator_IHelper.write (_out,value);
	}
}
