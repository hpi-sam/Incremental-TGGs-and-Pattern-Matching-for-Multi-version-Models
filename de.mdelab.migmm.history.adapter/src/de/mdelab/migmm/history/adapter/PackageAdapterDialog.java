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

public class PackageAdapterDialog extends TitleAreaDialog {

	private URI initialModel;
	
	private Text inputText;
	private String inputModel;
	
	private Text outputText;
	private String outputModel;

	private boolean isCorr;

	protected PackageAdapterDialog(Shell parentShell) {
		this(parentShell, null);
	}

	protected PackageAdapterDialog(Shell parentShell, URI uri) {
		super(parentShell);
		this.initialModel = uri;
	}

    @Override
    public void create() {
        super.create();
        setTitle("Adapt Model");
        setMessage("Choose input and output models.", IMessageProvider.NONE);
    }
    
	@Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(3, false);
        container.setLayout(layout);

        createInputModelField(container);
        createOutputModelField(container);
        createCorrespondenceCheckBox(container);

        return area;
    }

	private void createInputModelField(Composite container) {
		Label inputLabel = new Label(container, SWT.NONE);
		inputLabel.setText("Input Model");

        GridData dataInput = new GridData();
        dataInput.grabExcessHorizontalSpace = true;
        dataInput.horizontalAlignment = GridData.FILL;

        inputText = new Text(container, SWT.BORDER);
        if(initialModel != null) {
        	setInput(initialModel.toString());
        }
        inputText.setLayoutData(dataInput);
        
        Button browseInput = new Button(container, SWT.PUSH);
        browseInput.setText("Browse...");
        browseInput.addSelectionListener(new SelectionAdapter() {
        	
        	 @Override
             public void widgetSelected(SelectionEvent e) {
        		 ResourceDialog fd = new ResourceDialog(getShell(), null, SWT.SINGLE);
        		 if(fd.open() == Window.OK) {
        			 setInput(fd.getURIText());
        		 }
             }
        	 
        });
	}

	private void setInput(String string) {
		inputModel = string;
    	inputText.setText(string);
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
            	setOutput(path + "/" + file + "_adapted.ecore");
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

	private void createCorrespondenceCheckBox(Composite container) {
		Label outputLabel = new Label(container, SWT.NONE);
		outputLabel.setText("Is Correspondence Model");
		
		Button corrBox = new Button(container, SWT.CHECK);
		corrBox.setText("");
		corrBox.addSelectionListener(new SelectionAdapter() {
			
		    @Override
		    public void widgetSelected(SelectionEvent event) {
	        	Button b = (Button) event.getSource();
	        	setIsCorr(b.getSelection());
		    }
		    
		});
	}

	protected void setIsCorr(boolean corr) {
		isCorr = corr;
	}

	public String getInputModel() {
		return inputModel;
	}

	public String getOutputModel() {
		return outputModel;
	}
	
	public boolean getIsCorr() {
		return isCorr;
	}

}
