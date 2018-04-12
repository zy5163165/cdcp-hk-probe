package FH_FaultAnalyzer;

/**
 *	Generated from IDL interface "FH_FaultAnalyzerMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class FH_FaultAnalyzerMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public FH_FaultAnalyzerMgr_I value;
	public FH_FaultAnalyzerMgr_IHolder()
	{
	}
	public FH_FaultAnalyzerMgr_IHolder (final FH_FaultAnalyzerMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FH_FaultAnalyzerMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FH_FaultAnalyzerMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FH_FaultAnalyzerMgr_IHelper.write (_out,value);
	}
}
