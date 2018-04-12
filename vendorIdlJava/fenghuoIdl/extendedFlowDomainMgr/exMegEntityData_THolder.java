package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of struct "exMegEntityData_T"
 *	@author JacORB IDL compiler 
 */

public final class exMegEntityData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedFlowDomainMgr.exMegEntityData_T value;

	public exMegEntityData_THolder ()
	{
	}
	public exMegEntityData_THolder(final extendedFlowDomainMgr.exMegEntityData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedFlowDomainMgr.exMegEntityData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedFlowDomainMgr.exMegEntityData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedFlowDomainMgr.exMegEntityData_THelper.write(_out, value);
	}
}
