// see also .. https://github.com/gimp-ci/jenkins-dsl/blob/2c53863eca8d689f23bd8554a3cd47831bfa7606/jobs/gimp_multibranch_pipelines.groovy#L27-L29
// re branch discovery

import utils.JobConfigurator

def cfg = new JobConfigurator(this, out, [
        gitRepo: "infra/projectA_dsl",
        branches: "master"
])

folder("projectA")

cfg.multibranchPipeline jobName: "projectA/dsl", scriptPath: "Jenkinsfile.jobdsl"
