package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "BusinessCutOverPlan_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverPlan_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.BusinessCutOverPlan_T value;

	public BusinessCutOverPlan_THolder ()
	{
	}
	public BusinessCutOverPlan_THolder(final extendedEmsMgr.BusinessCutOverPlan_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.BusinessCutOverPlan_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.BusinessCutOverPlan_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.BusinessCutOverPlan_THelper.write(_out, value);
	}
}