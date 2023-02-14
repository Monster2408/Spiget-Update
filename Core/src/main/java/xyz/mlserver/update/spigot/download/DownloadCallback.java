package xyz.mlserver.update.spigot.download;

public interface DownloadCallback {

	void finished();

	void error(Exception exception);

}
