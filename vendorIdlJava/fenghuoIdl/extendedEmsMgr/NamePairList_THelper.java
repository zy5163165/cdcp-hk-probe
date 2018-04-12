package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "NamePairList_T"
 *	@author JacORB IDL compiler 
 */

public final class NamePairList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, extendedEmsMgr.NamePair_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static extendedEmsMgr.NamePair_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(extendedEmsMgr.NamePairList_THelper.id(), "NamePairList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, extendedEmsMgr.NamePair_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/NamePairList_T:1.0";
	}
	public static extendedEmsMgr.NamePair_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		extendedEmsMgr.NamePair_T[] _result;
		int _l_result11 = _in.read_long();
		_result = new extendedEmsMgr.NamePair_T[_l_result11];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=extendedEmsMgr.NamePair_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, extendedEmsMgr.NamePair_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			extendedEmsMgr.NamePair_THelper.write(_out,_s[i]);
		}

	}
}
