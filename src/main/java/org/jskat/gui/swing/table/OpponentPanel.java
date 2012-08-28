/**
 * JSkat - A skat program written in Java
 * by Jan Schäfer, Markus J. Luzius and Daniel Loreck
 *
 * Version 0.11.0
 * Copyright (C) 2012-08-28
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jskat.gui.swing.table;

import javax.swing.ActionMap;

/**
 * Panel for showing informations about opponents
 */
public class OpponentPanel extends AbstractHandPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * @see AbstractHandPanel#AbstractHandPanel(ActionMap, int, boolean)
	 */
	public OpponentPanel(ActionMap actions, int maxCards, boolean showIssWidgets) {

		super(actions, maxCards, showIssWidgets);
	}
}
