package org.bimserver.soaptest;

/******************************************************************************
 * Copyright (C) 2009-2012  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.bimserver.generatedclient.SDownloadResult;
import org.bimserver.generatedclient.SProject;
import org.bimserver.generatedclient.ServerException_Exception;
import org.bimserver.generatedclient.ServiceInterfaceService;
import org.bimserver.generatedclient.Soap;
import org.bimserver.generatedclient.UserException_Exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DownloadTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(DownloadTest.class);
	public static void main(String[] args) {
		new DownloadTest().start();
	}

	private void start() {
		try {
			URL url = new URL("http://localhost:8080/soap?wsdl");
			ServiceInterfaceService service = new ServiceInterfaceService(url);
			Soap soapPort = service.getSoapPort();
			((BindingProvider) soapPort).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
			soapPort.login("admin@bimserver.org", "admin");
			for (SProject sProject : soapPort.getAllProjects()) {
				for (long roid: sProject.getRevisions()) {
					Integer download = soapPort.download(roid, "Ifc2x3", true, true);
					SDownloadResult downloadData = soapPort.getDownloadData(download);
					System.out.println(downloadData.getFile().length + " bytes downloaded");
				}
			}
		} catch (MalformedURLException e) {
			LOGGER.error("", e);
		} catch (UserException_Exception e) {
			LOGGER.error("", e);
		} catch (ServerException_Exception e) {
			LOGGER.error("", e);
		}
	}
}
