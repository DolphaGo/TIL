# 🚀 엔터프라이즈 AI 백엔드 엔지니어 정복 로드맵 (Master)

이 로드맵은 단순 기술 습득을 넘어, **"대규모 시스템을 설계하고 AI를 비즈니스 가치로 전환"**하는 데 초점이 맞춰져 있습니다.

---

## 🏗️ Phase 1: 아키텍처 및 고성능 백엔드 (Back-end Mastery)
*단순 API 구현을 넘어 '시스템'을 만드는 단계입니다.*

- [ ] **디자인 패턴과 Clean Architecture**
    - [ ] **Task:** 계층형 아키텍처(Layered) vs 헥사고날(Hexagonal) 아키텍처 차이점 정리.
    - [ ] **Task:** GoF 디자인 패턴 중 Strategy, Observer, Decorator 실제 코드로 구현.
    - [ ] 💡 **Tip:** 면접에서 "왜 이 패턴을 썼나요?"라는 질문에 "유지보수와 테스트 코드 작성이 쉬워져서"라고 논리적으로 답할 수 있어야 합니다.
- [ ] **DB 성능 최적화 및 동시성 제어**
    - [ ] **Task:** DB Index(B-Tree)의 원리와 복합 인덱스 생성 시 주의점(선행 컬럼) 학습.
    - [ ] **Task:** 비관적 락(Pessimistic) vs 낙관적 락(Optimistic)의 사용 사례 비교.
    - [ ] 💡 **Tip:** "사용자가 동시에 좋아요 버튼을 1만 번 누르면 어떻게 처리할 것인가?"에 대한 해답을 준비하세요.
- [ ] **비동기 프로그래밍 & 논블로킹 I/O**
    - [ ] **Task:** Python(FastAPI/asyncio) 또는 Java(WebFlux/Coroutines) 기반의 논블로킹 서버 구현.
    - [ ] 💡 **Tip:** I/O Bound 작업(API 호출, DB 조회)에서 CPU 자원을 어떻게 효율적으로 쓰는지 수치로 이해하세요.

---

## 🌐 Phase 2: 확장 가능한 분산 시스템 (Scalability & Distributed)
*공고의 '분산 시스템' 및 'Multi-tenant' 요구사항을 해결합니다.*

- [ ] **메시징 시스템 (Event-Driven)**
    - [ ] **Task:** Kafka를 활용한 Producer/Consumer 패턴 구현 및 장애 시 복구 전략(Retry Topic) 수립.
    - [ ] 💡 **Tip:** 메시지 중복 수송 문제 해결을 위한 '멱등성(Idempotency)' 보장 로직은 필수입니다.
- [ ] **멀티테넌시 (Multi-tenancy) 설계**
    - [ ] **Task:** 테넌트별 DB 스키마 분리 전략(Schema-per-tenant) 연구.
    - [ ] 💡 **Tip:** "A 회사의 직원이 B 회사의 데이터를 절대 볼 수 없게 만드는 아키텍처 레벨의 방어선"이 핵심입니다.
- [ ] **분산 트랜잭션 및 일관성**
    - [ ] **Task:** Saga 패턴 또는 2PC(Two-Phase Commit)의 개념 이해.
    - [ ] 💡 **Tip:** 마이크로서비스 간에 데이터가 꼬였을 때 보상 트랜잭션을 어떻게 날릴지 시나리오를 짜보세요.

---

## 🤖 Phase 3: LLM & RAG 엔지니어링 (AI Integration)
*우대사항의 핵심인 'AI 품질 관리'와 'RAG'를 정복합니다.*

- [ ] **고급 RAG 파이프라인 구축**
    - [ ] **Task:** Semantic Chunking(의미 단위 분할) 적용 및 Metadata Filtering 구현.
    - [ ] **Task:** Multi-query Retrieval(질문 확장) 및 Re-ranking(결과 재정렬) 로직 추가.
    - [ ] 💡 **Tip:** 단순히 결과를 내는 게 목표가 아닙니다. "검색된 문서가 실제 질문과 얼마나 관련 있는가?"를 측정하는 것이 기술력입니다.
- [ ] **Vector Database & 임베딩**
    - [ ] **Task:** Vector DB(Milvus, Weaviate 등)에서 HNSW 인덱스 파라미터 튜닝.
    - [ ] 💡 **Tip:** 데이터가 100만 건 이상일 때 검색 속도를 100ms 이내로 끊기 위한 인덱싱 전략을 고민하세요.
- [ ] **AI 품질 및 가드레일 (LLMOps 기초)**
    - [ ] **Task:** Ragas 프레임워크로 Faithfulness(할루시네이션 방지) 점수 측정.
    - [ ] **Task:** Prompt Injection 방지를 위한 입력값 검증 로직 구현.
    - [ ] 💡 **Tip:** "AI가 가끔 거짓말을 하는데 서비스에 적용해도 될까요?"라는 질문에 대한 기술적 해결책을 준비하세요.

---

## ☁️ Phase 4: 클라우드 네이티브 운영 (DevOps & Cloud)
*CKA/CKAD를 넘어 실제 서비스 배포 및 외부 연동 능력을 기릅니다.*

- [ ] **Kubernetes 심화 (CKA/CKAD 연계)**
    - [ ] **Task:** Helm Chart를 이용한 서비스 패키징 및 배포 자동화.
    - [ ] **Task:** Resource Limit/Request 설정을 통한 클러스터 자원 최적화.
    - [ ] 💡 **Tip:** 단순히 띄우는 게 아니라, 트래픽 폭주 시 Pod이 어떻게 자동으로 늘어나고(HPA) 죽었을 때 어떻게 살아나는지(Liveness/Readiness Probe)가 중요합니다.
- [ ] **엔터프라이즈 시스템 연동**
    - [ ] **Task:** OAuth2 기반 Slack App 연동 및 상호작용(Interactive Message) 처리.
    - [ ] 💡 **Tip:** 외부 API 장애 시 내 서비스에 영향이 가지 않도록 'Circuit Breaker' 패턴을 적용해 보세요.
- [ ] **Observability (관측성)**
    - [ ] **Task:** Distributed Tracing(Jaeger/Zipkin)을 이용해 API 요청 한 번이 여러 서비스를 거치는 과정 시각화.
    - [ ] 💡 **Tip:** "로그만 보고 장애 지점을 5분 안에 찾을 수 있는 시스템"을 지향하세요.
