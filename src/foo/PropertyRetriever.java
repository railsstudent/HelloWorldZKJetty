package foo;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Vlayout;

public class PropertyRetriever extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	Textbox input; // wired to a component input
	
	@Wire
	Vlayout result; // wired to a component called result
	
	@Listen("onClick=#retrieve")
	public void submit(Event event) throws Exception {
		String key = input.getValue();
		String prop = System.getProperty(key);
		result.appendChild(new Label(key + " = " + prop));
	}
	

}
