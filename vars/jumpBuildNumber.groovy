def call(configMap) {
    if (configMap == null) {
        configMap = [:]
    }
	final String oldJobName = configMap.getOrDefault("old_job_name", '')
	final String newJobName = configMap.getOrDefault("new_job_name", '')
	
	if (oldJobName == null || oldJobName.trim() == "") {
        	throw new NullPointerException("The old_job_name cannot be blank or null!")
	}	
	
	if (newJobName == null || newJobName.trim() == "") {
        	throw new NullPointerException("The new_job_name cannot be blank or null!")
	}	

	job = Jenkins.instance.getItemByFullName(oldJobName)
	nextBuildNumber=job.getNextBuildNumber()
	//Update next build number only for 'master' branch job as BakeIamge runs only for master/develop branch
	job = Jenkins.instance.getItemByFullName(newJobName+"/master")
	job.nextBuildNumber = nextBuildNumber
	job.saveNextBuildNumber()


