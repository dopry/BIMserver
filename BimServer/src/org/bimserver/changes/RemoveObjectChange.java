package org.bimserver.changes;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bimserver.BimServer;
import org.bimserver.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.OldQuery;
import org.bimserver.database.OldQuery.Deep;
import org.bimserver.database.actions.AbstractDownloadDatabaseAction;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.PackageMetaData;
import org.bimserver.ifc.BasicIfcModel;
import org.bimserver.ifc.IfcModel;
import org.bimserver.models.store.ConcreteRevision;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.shared.HashMapVirtualObject;
import org.bimserver.shared.exceptions.UserException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public class RemoveObjectChange implements Change {

	private final long oid;
	private EClass eClass;

	/**
	 * This is a potentially quite slow action
	 * 
	 * @param oid
	 * @param eClass
	 */
	public RemoveObjectChange(long oid, EClass eClass) {
		this.oid = oid;
		this.eClass = eClass;
	}

	public EClass geteClass() {
		return eClass;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void execute(BimServer bimServer, Revision previousRevision, Project project, ConcreteRevision concreteRevision, DatabaseSession databaseSession, Map<Long, HashMapVirtualObject> created, Map<Long, HashMapVirtualObject> deleted) throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		throw new UserException("Not implemented");
	}
}