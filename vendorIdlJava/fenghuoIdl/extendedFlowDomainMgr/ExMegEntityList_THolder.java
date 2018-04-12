package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of alias "ExMegEntityList_T"
 *	@author JacORB IDL compiler 
 */

public final class ExMegEntityList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedFlowDomainMgr.exMegEntityData_T[] value;

	public ExMegEntityList_THolder ()
	{
	}
	public ExMegEntityList_THolder (final extendedFlowDomainMgr.exMegEntityData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExMegEntityList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExMegEntityList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExMegEntityList_THelper.write (out,value);
	}
}
