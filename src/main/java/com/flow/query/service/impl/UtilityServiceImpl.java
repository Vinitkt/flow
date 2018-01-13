package com.flow.query.service.impl;

import org.springframework.stereotype.Service;

import com.flow.query.repository.UtilityService;

@Service
public class UtilityServiceImpl implements UtilityService {

	/*private SessionFactory<FTPFile> ftpSessionFactory() {
		DefaultFtpSessionFactory sf = new DefaultFtpSessionFactory();
		sf.setHost("dotzot.cloudapp.net");
		sf.setUsername("DZTuser");
		sf.setPassword("ftppass");
		return new CachingSessionFactory<>(sf);
	}

	private FtpInboundFileSynchronizer ftpInboundFileSynchronizer() {
		FtpInboundFileSynchronizer fileSynchronizer = new FtpInboundFileSynchronizer(ftpSessionFactory());
		fileSynchronizer.setDeleteRemoteFiles(false);
		fileSynchronizer.setRemoteDirectory("/DZTuser");
		fileSynchronizer.setFilter(new FtpSimplePatternFileListFilter("*.xlsx"));
		
		return fileSynchronizer;
	}

	@InboundChannelAdapter(channel = "ftpChannel", poller = @Poller(fixedDelay = "50000"))
	private MessageSource<File> ftpMessageSource() {
		FtpInboundFileSynchronizingMessageSource source = new FtpInboundFileSynchronizingMessageSource(
				ftpInboundFileSynchronizer());
		
		source.setLocalDirectory(new File("ftp-inbound"));
		source.setAutoCreateLocalDirectory(true);
		source.setLocalFilter(new AcceptOnceFileListFilter<>());
		 
		return source;
	}

	public void ftpStream() {

	}*/

}
