package mLSNPPLink;

/**
 *	Generated from IDL definition of struct "LayeredSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPPLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LayeredSNPPLink_T(){}
	public short layerRate;
	public mLSNPPLink.SNPPLink_T[] sNPPLinkList;
	public LayeredSNPPLink_T(short layerRate, mLSNPPLink.SNPPLink_T[] sNPPLinkList)
	{
		this.layerRate = layerRate;
		this.sNPPLinkList = sNPPLinkList;
	}
}
