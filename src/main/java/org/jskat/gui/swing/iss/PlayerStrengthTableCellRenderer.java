package org.jskat.gui.swing.iss;

import java.text.NumberFormat;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class PlayerStrengthTableCellRenderer extends DefaultTableCellRenderer {

	private static final long serialVersionUID = 1L;

	PlayerStrengthTableCellRenderer() {
		setHorizontalAlignment(SwingConstants.RIGHT);
	}

	@Override
	public void setValue(Object playerStrength) {
		Object result = playerStrength;
		if ((playerStrength != null) && (playerStrength instanceof Number)) {
			Number numberValue = (Number) playerStrength;
			NumberFormat formatter = NumberFormat.getNumberInstance();
			formatter.setMinimumFractionDigits(1);
			formatter.setMaximumFractionDigits(1);
			result = formatter.format(numberValue.doubleValue());
		}
		super.setValue(result);
	}
}
