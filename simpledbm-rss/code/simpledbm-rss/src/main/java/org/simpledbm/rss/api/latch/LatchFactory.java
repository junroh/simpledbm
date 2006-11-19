/***
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 *    Project: www.simpledbm.org
 *    Author : Dibyendu Majumdar
 *    Email  : dibyendu@mazumdar.demon.co.uk
 */
package org.simpledbm.rss.api.latch;

/**
 * A factory for creating instances of Latches.
 * @author Dibyendu Majumdar
 */
public interface LatchFactory {
	
	/**
	 * Creates a new ReadWrite Latch. A ReadWrite latch supports
	 * locking in Shared and Exclusive modes. 
	 */
	Latch newReadWriteLatch();
	
	/**
	 * Returns a new ReadWriteUpdate Latch. Similar to ReadWrite latch,
	 * but supports an additional Update lock mode. 
	 */
	Latch newReadWriteUpdateLatch();
	
	/**
	 * Creates a default Latch implementation. This is the most efficient
	 * implementation, however, may not support Update mode locks.
	 */
	Latch newLatch();
}