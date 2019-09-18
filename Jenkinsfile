pipeline{

stages
{
 stage('Clone sources') {
        git url: 'https://github.com/shekarreddyn/startup-demo.git'
    }
stage('build')
{
buildInfo = rtGradle.run rootDir: "F:\\Work Space\IntelliJ Work Space\startup-demo\", buildFile: 'build.gradle', tasks: 'clean artifactoryPublish'
}
stage('UCD'){
step

([$class: 'UCDeployPublisher', altUser: [altPassword: <object of type hudson.util.Secret>, altUsername: ''], component: [componentName: '', componentTag: '', delivery: [$class: 'Push', baseDir: '', fileExcludePatterns: '', fileIncludePatterns: '**/*', pushDescription: '', pushIncremental: false, pushProperties: '', pushVersion: '']], deploy: [deployApp: '', deployDesc: 'Requested from Jenkins', deployEnv: '', deployOnlyChanged: true, deployProc: '', deployReqProps: '', deployVersions: '', skipWait: false], siteName: 'https://udeploy-server:8444/'])

}
stage('deploy')
{
steps {

                withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                  credentialsId   : 'PCF_LOGIN',
                                  usernameVariable: 'USERNAME',
                                  passwordVariable: 'PASSWORD']])
                sh 'cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
                sh 'cf push'



}
}


}


}