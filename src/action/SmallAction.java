package action;

import PhotoViewer.*;

public class SmallAction implements Action
{

	public void execute(ViewerService service, ViewerFrame frame)
	{
		service.zoom(frame, false);
	}

}
