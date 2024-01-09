package dut.edition4.dtmc.design.utils;

import java.io.File;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
public class RunFile {
	public static void main(String[] args) throws Exception{
		System.out.println("OKa");
		EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());
		module.parse(new File("E:\\Dtmc\\Edition4-runtime-EclipseApplication\\dut.edition4.dtmc.design\\models\\dtmc2pm.egx").getAbsoluteFile());
		
		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}
		
		// Load the EMF document
		EmfModel model = new EmfModel();
		model.setModelFile("E:\\Dtmc\\Edition4-runtime-EclipseApplication\\dut.edition4.dtmc.design\\models\\test.dtmc");
		model.setName("mc");		
		model.setMetamodelFile("E:\\Dtmc\\Edition4\\dut.edition4.dtmc\\dtmc.ecore");
		model.load();
		//InMemoryEmfModel theModel = new InMemoryEmfModel("dut.haochi.dtmc");
	
		// Make the document visible to the EGX program
		module.getContext().getModelRepository().addModel(model);
		// ... and execute
		module.execute();
	}
	
}