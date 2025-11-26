# Github Actions를 이용한 CI 테스트 자동화 구축 연습 repo

[![CI based on Gradle and Java](https://github.com/JeroCaller/gradle-ci-test/actions/workflows/ci.yml/badge.svg)](https://github.com/JeroCaller/gradle-ci-test/actions/workflows/ci.yml)

- 목표
  - Github Actions를 이용하여 main 브랜치로의 PR시 테스트 실행 및 결과 보고 자동화.
  - Jacoco 도입으로 코드 커버리지 실행 및 결과 출력 자동화.
  - 테스트 모두 성공 및 코드 커버리지 기준치 이상을 넘겨야만 Merge 허용하도록 자동화.
  - CI로 구축한 테스트 및 코드 커버리지 결과를 뱃지로도 볼 수 있도록 하기. 

- 연습용 앱 제작에 사용된 기술
    - Java
    - SpringBoot
    - Gradle
    - JUnit
