package xyz.mlserver.update.spiget.download;

public interface DownloadCallback {

	void finished();

	void error(Exception exception);

}
