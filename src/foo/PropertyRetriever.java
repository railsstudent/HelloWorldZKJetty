package foo;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.util.Composer;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

public class PropertyRetriever implements Composer<Component> {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void doAfterCompose(final Component target) throws Exception {
		target.addEventListener("onClick", 
				new EventListener() {
					public void onEvent(Event event) throws Exception {
						String prop = System.getProperty(((Textbox) target.query("#input")).getValue());
						target.query("#result").appendChild(new Label(prop));
					}
		});
	}

}
