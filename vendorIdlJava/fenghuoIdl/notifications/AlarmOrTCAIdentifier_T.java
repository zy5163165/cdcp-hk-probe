package notifications;

/**
 *	Generated from IDL definition of union "AlarmOrTCAIdentifier_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmOrTCAIdentifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private notifications.AlarmTypeQualifier_T discriminator;
	private notifications.AlarmId_T alarmId;
	private notifications.TCAId_T tcaId;

	public AlarmOrTCAIdentifier_T ()
	{
	}

	public notifications.AlarmTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public notifications.AlarmId_T alarmId ()
	{
		if (discriminator != notifications.AlarmTypeQualifier_T.ALARM)
			throw new org.omg.CORBA.BAD_OPERATION();
		return alarmId;
	}

	public void alarmId (notifications.AlarmId_T _x)
	{
		discriminator = notifications.AlarmTypeQualifier_T.ALARM;
		alarmId = _x;
	}

	public notifications.TCAId_T tcaId ()
	{
		if (discriminator != notifications.AlarmTypeQualifier_T.TCA)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tcaId;
	}

	public void tcaId (notifications.TCAId_T _x)
	{
		discriminator = notifications.AlarmTypeQualifier_T.TCA;
		tcaId = _x;
	}

}
