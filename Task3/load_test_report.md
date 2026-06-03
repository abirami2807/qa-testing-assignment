# Load Test Report

## 1. Application Under Test
- **Application:** ReqRes API  
- **Endpoint Tested:**  
  `GET https://reqres.in/api/users?page=1`

---

## 2. Tool Used
- Postman Performance Runner

---

## 3. Test Configuration

| Parameter | Value |
|----------|------|
| Virtual Users (Concurrent Users) | 50 VUs |
| Test Duration | 2 Minutes |
| Profile Type | Fixed Profile |
| Total Requests Sent | 11,053 |

---

## 4. Performance Metrics

| Metric | Value |
|--------|------|
| Average Response Time | 212 ms |
| Minimum Response Time | 29 ms |
| Maximum Response Time | 940 ms |
| P90 Response Time | 308 ms |
| P95 Response Time | 657 ms |
| P99 Response Time | 1,208 ms |
| Requests Per Second (Throughput) | 96.72 req/sec |
| Failed Requests | 0 |
| Error Rate | 0.00% |
| Failure Rate | 50.97% |

---

## 5. Test Results Analysis

### Response Time Analysis
- Average response time: **212 ms**, indicating good API responsiveness.
- Fastest request: **29 ms**
- Slowest request: **940 ms**
- 90% of requests completed within **308 ms**
- 95% within **657 ms**
- 99% within **1,208 ms**

---

### Throughput Analysis
- The API processed **96.72 requests per second**
- Total requests handled: **11,053** over 2 minutes
- Indicates strong handling capacity under load

---

### Error Analysis
- **Error Rate:** 0.00% (no server or network failures)
- **Failure Rate:** 50.97%  
  - Indicates Postman test assertions or validation checks failed
  - API responses were successful but validations may not have matched expected conditions

---

### Resource Utilization
- Peak CPU Usage: **97.7%**
- Peak Memory Usage: **95.8%**

> The load generator machine was heavily utilized during the test execution.

---

## 6. Final Observation

The **ReqRes API** demonstrated stable performance under a load of **50 concurrent users for 2 minutes**.  

- Successfully processed **11,053 requests**
- Maintained an average response time of **212 ms**
- Achieved **0% error rate**
- Delivered **96.72 req/sec throughput**

However, a **50.97% failure rate** was observed due to likely assertion/validation mismatches in the Postman test script rather than actual API failures.

### Overall Conclusion
The API shows **good responsiveness and stability under load**, but test assertions should be reviewed to ensure accurate validation of responses.