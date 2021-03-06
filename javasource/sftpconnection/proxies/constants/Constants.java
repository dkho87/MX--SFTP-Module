// This file was generated by Mendix Modeler 6.8.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sftpconnection.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the SFTPConnection module

	/**
	* Minutes the session may remain idle.
	*/
	public static Long getIdleSessionTime()
	{
		return (Long)Core.getConfiguration().getConstantValue("SFTPConnection.IdleSessionTime");
	}
}