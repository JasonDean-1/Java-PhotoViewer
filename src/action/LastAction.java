package action;

import PhotoViewer.*;

public class LastAction implements Action
{

	public void execute(ViewerService service, ViewerFrame frame)
	{
		service.last(frame);
	}

}
