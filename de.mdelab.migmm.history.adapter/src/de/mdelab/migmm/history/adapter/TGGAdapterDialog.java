package de.mdelab.migmm.history.adapter;

import java.net.URI;
import java.util.regex.Pattern;

import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TGGAdapterDialog extends TitleAreaDialog {

	private URI initialModel;
	
	private Text inputTGGText;
	private String inputTGG;

	private Text sourceMappingText;
	private String sourceMapping;
	private Text corrMappingText;
	private String corrMapping;
	private Text targetMappingText;
	private String targetMapping;
	
	private Text outputText;
	private String outputModel;

	protected TGGAdapterDialog(Shell parentShell) {
		this(parentShell, null);
	}

	protected TGGAdapterDialog(Shell parentShell, URI uri) {
		super(parentShell);
		this.initialModel = uri;
	}

    @Override
    public void create() {
        super.create();
        setTitle("Adapt TGG");
        setMessage("Choose input tgg and mapping and output tgg.", IMessageProvider.NONE);
    }
    
	@Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(3, false);
        container.setLayout(layout);

        createInputTGGField(container);
        createSourceMappingField(container);
        createCorrespondenceMappingField(container);
        createTargetMappingField(container);
        createOutputModelField(container);

        return area;
    }

	private void createInputTGGField(Composite container) {
		Label inputLabel = new Label(container, SWT.NONE);
		inputLabel.setText("Input TGG");

        GridData dataInput = new GridData();
        dataInput.grabExcessHorizontalSpace = true;
        dataInput.horizontalAlignment = GridData.FILL;

        inputTGGText = new Text(container, SWT.BORDER);
        if(initialModel != null) {
        	setInputTGG(initialModel.toString());
        }
        inputTGGText.setLayoutData(dataInput);
        
        Button browseInput = new Button(container, SWT.PUSH);
        browseInput.setText("Browse...");
        browseInput.addSelectionListener(new SelectionAdapter() {
        	
        	 @Override
             public void widgetSelected(SelectionEvent e) {
        		 ResourceDialog fd = new ResourceDialog(getShell(), null, SWT.SINGLE);
        		 if(fd.open() == Window.OK) {
        			 setInputTGG(fd.getURIText());
        		 }
             }
        	 
        });
	}

	private void setInputTGG(String string) {
		inputTGG = string;
		inputTGGText.setText(string);
	}

	private void createSourceMappingField(Composite container) {
		Label inputLabel = new Label(container, SWT.NONE);
		inputLabel.setText("Source Mapping");

        GridData dataInput = new GridData();
        dataInput.grabExcessHorizontalSpace = true;
        dataInput.horizontalAlignment = GridData.FILL;

        sourceMappingText = new Text(container, SWT.BORDER);
        sourceMappingText.setLayoutData(dataInput);
        
        Button browseInput = new Button(container, SWT.PUSH);
        browseInput.setText("Browse...");
        browseInput.addSelectionListener(new SelectionAdapter() {
        	
        	 @Override
             public void widgetSelected(SelectionEvent e) {
        		 ResourceDialog fd = new ResourceDialog(getShell(), null, SWT.SINGLE);
        		 if(fd.open() == Window.OK) {
        			 setSourceMapping(fd.getURIText());
        		 }
             }
        	 
        });
	}

	private void setSourceMapping(String string) {
		sourceMapping = string;
		sourceMappingText.setText(string);
	}

	private void createCorrespondenceMappingField(Composite container) {
		Label inputLabel = new Label(container, SWT.NONE);
		inputLabel.setText("Correspondence Mapping");

        GridData dataInput = new GridData();
        dataInput.grabExcessHorizontalSpace = true;
        dataInput.horizontalAlignment = GridData.FILL;

        corrMappingText = new Text(container, SWT.BORDER);
        corrMappingText.setLayoutData(dataInput);
        
        Button browseInput = new Button(container, SWT.PUSH);
        browseInput.setText("Browse...");
        browseInput.addSelectionListener(new SelectionAdapter() {
        	
        	 @Override
             public void widgetSelected(SelectionEvent e) {
        		 ResourceDialog fd = new ResourceDialog(getShell(), null, SWT.SINGLE);
        		 if(fd.open() == Window.OK) {
        			 setCorrespondenceMapping(fd.getURIText());
        		 }
             }
        	 
        });
	}

	private void setCorrespondenceMapping(String string) {
		corrMapping = string;
		corrMappingText.setText(string);
	}


	private void createTargetMappingField(Composite container) {
		Label inputLabel = new Label(container, SWT.NONE);
		inputLabel.setText("Target Mapping");

        GridData dataInput = new GridData();
        dataInput.grabExcessHorizontalSpace = true;
        dataInput.horizontalAlignment = GridData.FILL;

        targetMappingText = new Text(container, SWT.BORDER);
        targetMappingText.setLayoutData(dataInput);
        
        Button browseInput = new Button(container, SWT.PUSH);
        browseInput.setText("Browse...");
        browseInput.addSelectionListener(new SelectionAdapter() {
        	
        	 @Override
             public void widgetSelected(SelectionEvent e) {
        		 ResourceDialog fd = new ResourceDialog(getShell(), null, SWT.SINGLE);
        		 if(fd.open() == Window.OK) {
        			 setTargetMapping(fd.getURIText());
        		 }
             }
        	 
        });
	}

	private void setTargetMapping(String string) {
		targetMapping = string;
		targetMappingText.setText(string);
	}

	private void createOutputModelField(Composite container) {
		Label outputLabel = new Label(container, SWT.NONE);
		outputLabel.setText("Output Model");

        GridData dataOutput = new GridData();
        dataOutput.grabExcessHorizontalSpace = true;
        dataOutput.horizontalAlignment = GridData.FILL;

        outputText = new Text(container, SWT.BORDER);
        if(initialModel != null) {
        	String uriString = initialModel.toString();
        	int index = uriString.lastIndexOf('/');
        	if(index != -1 && index != uriString.length() - 1) {
            	String path = uriString.substring(0, index);
            	String file = uriString.substring(index + 1).split(Pattern.quote("."))[0];
            	setOutput(path + "/" + file + "_adapted.mltgg");
        	}
        }
        outputText.setLayoutData(dataOutput);

        Button browseOutput = new Button(container, SWT.PUSH);
        browseOutput.setText("Browse...");
        browseOutput.addSelectionListener(new SelectionAdapter() {
        	
        	 @Override
             public void widgetSelected(SelectionEvent e) {
        		 ResourceDialog fd = new ResourceDialog(getShell(), null, SWT.SAVE);
        		 if(fd.open() == Window.OK) {
        			 setOutput(fd.getURIText());
        		 }
             }
        	 
        });
	}

	private void setOutput(String string) {
		outputModel = string;
		outputText.setText(string);
	}

	public String getInputTGG() {
		return inputTGG;
	}

	public String getSourceMapping() {
		return sourceMapping;
	}

	public String getCorrespondenceMapping() {
		return corrMapping;
	}

	public String getTargetMapping() {
		return targetMapping;
	}

	public String getOutputModel() {
		return outputModel;
	}

}
