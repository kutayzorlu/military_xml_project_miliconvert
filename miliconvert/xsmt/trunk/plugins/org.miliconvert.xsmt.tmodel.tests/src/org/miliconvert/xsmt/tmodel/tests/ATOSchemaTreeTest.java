package org.miliconvert.xsmt.tmodel.tests;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.ModelUtililies;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.tree.SchemaTree;

public class ATOSchemaTreeTest extends SchemaTestCase {

	private Schema s;
	private ModelUtililies mu;

	protected void setUp() throws Exception {

		super.setUp();
		s = loadSchema("test-data/ato/messages.xsd");
		mu = new ModelUtililies();
	}

	protected void tearDown() throws Exception {
		s = null;
		mu = null;
		super.tearDown();
	}

	public void testSwingTree() throws InterruptedException {
		XSDFeature root = mu.getRoots(s).get(0);
		assertNotNull(root);

		SchemaTree st = new SchemaTree(root);
		assertNotNull(st);

		JFrame jf = new JFrame("SchemaTreeTest");
		jf.setSize(600, 600);
		JComponent jco = jf.getRootPane();
		jco.setLayout(new BorderLayout());
		JTree jt = new JTree(st);
		jt.setCellRenderer(new SchemaTreeRenderer());

		jco.add(new JScrollPane(jt), BorderLayout.CENTER);
		JButton quit = new JButton("quit");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jco.add(quit, BorderLayout.SOUTH);
		jf.setVisible(true);
	}

}
