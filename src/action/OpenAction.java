package action;

import PhotoViewer.*;

public class OpenAction implements Action
{

	public void execute(ViewerService service, ViewerFrame frame)
	{
		service.open(frame);
	}

}
