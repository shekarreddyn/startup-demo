pipeline{

stages
{
 stage('Clone sources') {
        git url: 'https://github.com/shekarreddyn/startup-demo.git'
    }
stage('build')
{
buildInfo = rtGradle.run rootDir: "F:\Work Space\IntelliJ Work Space\startup-demo\", buildFile: 'build.gradle', tasks: 'clean artifactoryPublish'
}
stage('deploy')
{
steps {

                withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                  credentialsId   : 'PCF_LOGIN',
                                  usernameVariable: 'USERNAME',
                                  passwordVariable: 'PASSWORD']])
                sh '/usr/local/bin/cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
                sh '/usr/local/bin/cf push'



}
}


}


}