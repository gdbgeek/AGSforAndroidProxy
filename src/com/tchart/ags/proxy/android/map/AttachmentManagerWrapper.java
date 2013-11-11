package com.tchart.ags.proxy.android.map;

import java.io.File;

import android.content.Context;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.map.AttachmentManager;
import com.esri.core.io.UserCredentials;

@BA.Author("Trevor Hart")
@BA.ShortName("AttachmentManager")

public class AttachmentManagerWrapper  extends AbsObjectWrapper<AttachmentManager>
{
	public AttachmentManagerWrapper()
	{
	}

	public AttachmentManagerWrapper(AttachmentManager pAttachmentManager)
	{
		setObject(pAttachmentManager);
	}

	/**
	* The Constructor.
	*/
	public void Initialize(Context context, String url, UserCredentials credentials, File attachmentDownloadDir)
	{
		setObject(new AttachmentManager(context, url, credentials, attachmentDownloadDir));
	}



	/**
	* Delete attachment.
	*/
	public boolean deleteAttachment(String attachmentFileName)
	{
		return getObject().deleteAttachment(attachmentFileName);
	}

	/**
	* Download attachment.
	*/
	public void downloadAttachment(long objectID, int attachmentId, String attachmentFileName, AttachmentManager.AttachmentDownloadListener downloadListener)
	{
		getObject().downloadAttachment(objectID, attachmentId, attachmentFileName, downloadListener);
		return;
	}

	/**
	* Gets the attachment download dir.
	*/
	public File getAttachmentDownloadDir()
	{
		return getObject().getAttachmentDownloadDir();
	}

	/**
	* Gets the attachment file.
	*/
	public File getAttachmentFile(String attachmentFileName)
	{
		return getObject().getAttachmentFile(attachmentFileName);
	}

	/**
	* Retrieve attachment infos.
	*/
	public void retrieveAttachmentInfos(long objectId, AttachmentManager.AttachmentRetrievalListener attachmentListener)
	{
		getObject().retrieveAttachmentInfos(objectId, attachmentListener);
		return;
	}

	/**
	* Sets the attachment download dir.
	*/
	public void setAttachmentDownloadDir(File attachmentDownloadDir)
	{
		getObject().setAttachmentDownloadDir(attachmentDownloadDir);
		return;
	}


}
