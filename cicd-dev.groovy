node('linux')
{
  stage ('Poll') {
    checkout([
      $class: 'GitSCM',
      branches: [[name: '*/main']],
      doGenerateSubmoduleConfigurations: false,
      extensions: [],
      userRemoteConfigs: [[url: 'https://github.com/ZOSOpenTools/netpbmport.git']]])
  }
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/netpbmport.git'), string(name: 'PORT_DESCRIPTION', value: 'Netpbm is a toolkit for manipulation of graphic images, including conversion of images between a variety of different formats.' ), string(name: 'BUILD_LINE', value: 'DEV') ]
  }
}
